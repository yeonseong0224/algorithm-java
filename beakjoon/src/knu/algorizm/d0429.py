from sys import stdin

input = stdin.readline

if __name__ == '__main__':
    # Input
    N, M = map(int, input().split())
    A = [*map(int, input().split())]

    # Solve
    A.sort()
    visited = [False] * N
    res = []
    temp = []

    bt()

    # Output
    print(*res, sep='\n')