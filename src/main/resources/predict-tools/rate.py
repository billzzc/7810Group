import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
import sys

def makeLinearRegression(x):
    diabetes = pd.read_csv('src/main/resources/predict-tools/data.csv')
    diabetes = diabetes.iloc[:, 1:]
    print('head:', diabetes.head(), '\nShape:', diabetes.shape)

    # 数据描述
    print(diabetes.describe())
    # 缺失值检验
    print(diabetes[diabetes.isnull() == True].count())
    # 相关系数0~0.3弱相关0.3~0.6中等程度相关0.6~1强相关
    print(diabetes.corr())

    # 通过加入一个参数kind='reg'，seaborn可以添加一条最佳拟合直线和95%的置信带。
    sns.pairplot(diabetes, x_vars=['bmi', 'bp', 's1', 's2', 's3', 's4', 's5', 's6'], y_vars='y', size=6, aspect=0.8,
                 kind='reg')
    plt.savefig("pairplot.png")
    # plt.show()

    x_train, x_test, y_train, y_test = train_test_split(diabetes.iloc[:, :10], diabetes.y, train_size=.80)

    #print("原始数据特征:", diabetes.ix[:, :10].shape,",训练数据特征:", x_train.shape,",测试数据特征:", x_test.shape)

    #print("原始数据标签:", diabetes.y.shape,",训练数据标签:", y_train.shape, ",测试数据标签:", y_test.shape)

    model = LinearRegression()
    model.fit(x_train, y_train)
    a = model.intercept_  # 截距
    b = model.coef_  # 回归系数
    #print("最佳拟合线:截距", a, ",回归系数：", b)

    # R方检测,决定系数r平方,评估模型的精确度
    score = model.score(x_test, y_test)
    #print("预测得分：", score)

    # 对线性回归进行预测
    y_pred = model.predict(x_test)
    #print('测试预测结果：', y_pred)
    #print('测试真实结果：', y_test)

    print(model.predict(x)) #预测你的糖尿病指数 

#print("输入身体指数1：age、 sex 、bmi、 map、 tc、 ldl、 hdl、 tch、 ltg、 glu")
arr = sys.argv[1:]
num = [[float(n) for n in arr]]
print(arr)
makeLinearRegression(num)