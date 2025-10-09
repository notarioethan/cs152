def add(X, Y):
    return X + Y

def curry2(f):
    def g(x):
        def h(y):
            return f(x, y)
        return h
    return g



#oot = add(100, 200)
#print(oot)

f = curry2(add)
print(f(100)(200))