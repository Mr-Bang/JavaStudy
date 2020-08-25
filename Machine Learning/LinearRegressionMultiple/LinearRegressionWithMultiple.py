import numpy as np
import pandas as pd
from LoadText import load_data
from normalize import *
from regression import regression
# 读取数据
lr = 0.01
theta = np.zeros((3,1))
iterations = 1000
data = load_data('ex1data2.txt')
data = np.array(data,np.float64)
x = data[:,(0,1)].reshape(-1,2)
y = data[:,2].reshape(-1,1)
# 数据标准化
x = normalizex(x)
x = np.hstack([x,np.ones((x.shape[0],1))])
y = normalizey(y)
theta = regression(x,y,lr,theta,iterations)
print(theta)