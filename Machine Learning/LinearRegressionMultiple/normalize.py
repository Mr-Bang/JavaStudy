import numpy as np
def normalizex(data):

    x_mean = np.mean(data,axis=0).reshape(-1,2)
    x_sig = np.std(data,axis=0).reshape(-1,2)
    a = data.shape[0]
    for i in range(data.shape[0]):
        data[i][0] = (data[i][0] - x_mean[0][0])/x_sig[0][0]
        data[i][1] = (data[i][1] - x_mean[0][1])/x_sig[0][1]

    return data


def normalizey(data):
    y_mean = np.mean(data, axis=0).reshape(-1,1)
    y_sig = np.std(data, axis=0).reshape(-1,1)
    for i in range(data.shape[0]):
        data[i][0] = (data[i][0] - y_mean[0][0]) / y_sig[0][0]

    return data