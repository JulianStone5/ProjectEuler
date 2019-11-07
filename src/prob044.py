import math

def P(n):
    return n*(3*n-1)//2

def isP(x):
    n = (.5+math.sqrt(.25+6*x))/3
    return n == n//1

def findPTerm(x):
    if(isP(x)):
        return int((.5+math.sqrt(.25+6*x))//3)
    return -1

found = False
for i in range(1,5000):
    for j in range(i+1,5001):
        Pi = P(i);
        Pj = P(j);
        sum = Pj+Pi;
        diff = Pj-Pi;
        if(isP(sum) and isP(diff)):
            print("i: {}\nPi: {}\nj: {}\nPj: {}\nsum: {}\nP for sum: {}\ndiff: {}\nP for diff: {}".format(i,Pi,j,Pj,sum,findPTerm(sum),diff,findPTerm(diff)))
            found = True
        if(found):
            break
    if(found):
        break
