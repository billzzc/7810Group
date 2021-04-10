import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
import sys

def ClusterAnalysis(x):
    ##使用聚类分析预测糖尿病
    diabetes = pd.read_csv('src/main/resources/predict-tools/diabetes.csv')
    print(diabetes.columns)
    # 查看各参数的直方图
    diabetes.groupby('Outcome').hist(figsize=(9, 9))
    # 检查参数的异常值
    print("Blood pressure Total : ", diabetes[diabetes.BloodPressure == 0].shape[0])
    print(diabetes[diabetes.BloodPressure == 0].groupby('Outcome')['Age'].count())
    print("Plasma glucose levels Total : ", diabetes[diabetes.Glucose == 0].shape[0])
    print(diabetes[diabetes.Glucose == 0].groupby('Outcome')['Age'].count())
    print("Skin Fold Thickness Total : ", diabetes[diabetes.SkinThickness == 0].shape[0])
    print(diabetes[diabetes.SkinThickness == 0].groupby('Outcome')['Age'].count())
    print("BMI Total : ", diabetes[diabetes.BMI == 0].shape[0])
    print(diabetes[diabetes.BMI == 0].groupby('Outcome')['Age'].count())
    print("Insulin Total : ", diabetes[diabetes.Insulin == 0].shape[0])
    print(diabetes[diabetes.Insulin == 0].groupby('Outcome')['Age'].count())
    # 移除异常值
    diabetes_mod = diabetes[(diabetes.BloodPressure != 0) & (diabetes.BMI != 0) & (diabetes.Glucose != 0)]

    x_train, x_test, y_train, y_test = train_test_split(diabetes.loc[:, diabetes.columns != 'Outcome'],
                                                        diabetes['Outcome'], stratify=diabetes['Outcome'],
                                                        random_state=66)

    from sklearn.neighbors import KNeighborsClassifier
    from sklearn.svm import SVC
    from sklearn.linear_model import LogisticRegression
    from sklearn.tree import DecisionTreeClassifier
    from sklearn.naive_bayes import GaussianNB
    from sklearn.ensemble import RandomForestClassifier
    from sklearn.ensemble import GradientBoostingClassifier

    models = []
    models.append(('KNN', KNeighborsClassifier()))
    models.append(('SVC', SVC()))
    # models.append(('LR', LogisticRegression()))
    models.append(('DT', DecisionTreeClassifier()))
    models.append(('GNB', GaussianNB()))
    models.append(('RF', RandomForestClassifier()))
    models.append(('GB', GradientBoostingClassifier()))

    from sklearn.model_selection import cross_val_score
    from sklearn.metrics import accuracy_score

    names = []
    scores = []
    for name, model in models:
        model.fit(x_train, y_train)
        y_pred = model.predict(x_test)
        scores.append(accuracy_score(y_test, y_pred))
        names.append(name)
    tr_split = pd.DataFrame({'Name': names, 'Score': scores})
    #print(tr_split)

    from sklearn.model_selection import GridSearchCV
    from sklearn.ensemble import RandomForestRegressor

    # Specify parameters
    c_values = list(np.arange(1, 10))
    param_grid = {'n_estimators': range(20, 81, 10), 'max_depth': range(3, 14, 2),
                  'min_samples_split': range(100, 1900, 200),
                  'min_samples_leaf': range(60, 101, 10)}

    # grid = GridSearchCV(GradientBoostingClassifier(), param_grid, cv=5, scoring='accuracy')
    # grid.fit(x_train, y_train)
    # print(grid.best_params_)
    # print(grid.best_estimator_)

    new_model = GradientBoostingClassifier(criterion='friedman_mse', init=None,
                                           learning_rate=0.1, loss='deviance', max_depth=3,
                                           max_features=None, max_leaf_nodes=None,
                                           min_impurity_decrease=0.0, min_impurity_split=None,
                                           min_samples_leaf=90, min_samples_split=300,
                                           min_weight_fraction_leaf=0.0, n_estimators=40,
                                           n_iter_no_change=None, random_state=None,
                                           subsample=1.0, tol=0.0001, validation_fraction=0.1,
                                           verbose=0, warm_start=False)
    new_model.fit(x_train, y_train)
    y_pred = new_model.predict(x_test)
    #print(y_pred)
    y_pred = new_model.predict(x)
    if y_pred == 1:
        print("结果：有糖尿病风险\n1") #结果：有糖尿病风险
    else:
        print("结果：无糖尿病风险\n0") #结果：无糖尿病风险

# print("输入身体指数2：pregnancies， glucose，blood pressure，skin thickness，insulin，BMI，Diabetes Pedigree Function")
arr = sys.argv[1:]
num = [[float(n) for n in arr]]
print(num)
ClusterAnalysis(num)