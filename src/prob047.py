import math

def isPrime(n):
    for i in range(2,round(math.sqrt(n))+1):
        if(n/i == n//i):
            return False
    return True

def findFactors(n):
    num = n
    factors = {}
    while(not isPrime(n)):
        i = 2
        iP = isPrime(i)
        iF = (n/i == n//i)
        while(not (iP and iF) and i < int(math.sqrt(n))+1):
            i = i + 1
            iP = isPrime(i)
            iF = (n/i == n//i)
        x = 0
        if(i in factors.keys()):
            x = factors[i]
        factors[i] = x + 1
        n = n//i
    x = 0
    if(n in factors.keys()):
        x = factors[n]
    factors[n] = x + 1
    for k in factors.keys():
        if(factors[k] != 1):
            factors[int(math.pow(k,factors[k]))] = 1
            factors.pop(k)
    return factors

def isCons(i,n):
    factors = findFactors(i);
    for j in range(1,n):
        f = findFactors(i+j)
        for k in f.keys():
            if(k in factors.keys()):
                return False
            factors[k] = f[k]
    return True

print(isCons(644,3))
