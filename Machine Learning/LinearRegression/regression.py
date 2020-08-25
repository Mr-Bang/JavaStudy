import numpy as np
def regression(x,y,lr,theta0,theta1,ite):
    x_mean = np.mean(x)
    y_mean = np.mean(y)
    loss = 0
    xy_mean = 0
    for i in range(len(x)):
        xy_mean += x[i]*y[i]
    xy_mean = xy_mean/len(x)
    xsquare_mean = 0
    for i in range(len(x)):
        xsquare_mean += x[i]*x[i]
    xsquare_mean = xsquare_mean/len(x)
    for i in range(ite):
        temp0 = theta0 - lr*(theta0+theta1*x_mean-y_mean)
        temp1 = theta1 - lr*(theta0*x_mean+theta1*xsquare_mean-xy_mean)
        theta0 = temp0
        theta1 = temp1
        for j in range(len(x)):
            loss +=((theta0+theta1*x[j]-y[j])*(theta0+theta1*x[j]-y[j]))/(2*len(x))
        print("loss is:",loss)
        loss = 0
    return theta0,theta1