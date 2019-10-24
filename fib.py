import time

def fib(n):
    if n<2:
        return 1
    else:
        return fib(n-1) + fib(n-2)

def main():
    print("------------------")
    print("F I B O N A C C I ")
    print("  P Y T H O N     ")
    print("------------------")   

    startTime = time.time()
    for i in range (0, 31):
        print(i, "\t", fib(i))

    print("The process took: " + str(1000* (time.time() - startTime)) + "ms")

main()