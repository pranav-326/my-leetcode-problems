class Solution(object):
    def generateParenthesis(self, n):
        stack=[]
        out=[]
        def backtrack(openN, closedN):
            if openN==n==closedN:
                out.append("".join(stack))
                return
            if openN<n:
                stack.append("(")
                backtrack(openN+1,closedN)
                stack.pop()
            if closedN<openN:
                stack.append(")")
                backtrack(openN,closedN+1)
                stack.pop()
        backtrack(0,0)
        return out