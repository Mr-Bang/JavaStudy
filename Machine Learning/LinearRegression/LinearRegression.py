import numpy as np
from regression import regression
from predict import predict
from matplotlib import pylab as pl
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
# 初始化训练数据
lr = 0.0001
ite = 80000
theta0 = 0
theta1 = 0
dataset = pd.read_csv('Salary_Data.csv')
x = dataset.iloc[:,0].values
y = dataset.iloc[:,-1].values
X_train,X_test,Y_train,Y_test = train_test_split(x,y,test_size = 0.3,random_state = 0)
X_train = X_train.reshape(-1,1)
Y_train = Y_train.reshape(-1,1)
# 定义回归方程
[theta0,theta1] = regression(X_train,Y_train,lr,theta0,theta1,ite)

# 绘制图形
xx = np.linspace(1,11)
yy = theta0+theta1*xx
pl.plot(xx,yy,'k-')
pl.scatter(X_train,Y_train,cmap=pl.cm.Paired)
pl.show()

