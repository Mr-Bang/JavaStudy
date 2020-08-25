import numpy as np
def regression(x,y,lr,theta,ite):
    m = y.shape[0]
    J_history = np.zeros((ite,1))
    for iter in range(ite):
        # 直接通过矩阵运算，更加的方便
        # 推导过程详见github

        theta = theta - (lr/m)*(x.T.dot(x.dot(theta) - y))
        # 计算损失
        C = x.dot(theta) - y
        J_history[iter] = (C.T.dot(C))/(2*m)
        print(J_history[iter])


    return theta