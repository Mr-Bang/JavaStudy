def load_data(filename):
    data = []
    with open(filename,'r') as f:
        for line in f.readlines():
            # readline只读取一行
            line = line.split(',')
            current = [int(item) for item in line]
            data.append(current)
    return data