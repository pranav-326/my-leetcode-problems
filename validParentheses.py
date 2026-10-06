# class Solution(object):
#     def checkValidString(self, s):
#         o=0
#         st=False
#         n=0
#         for c in s:
#             if c=='(':
#                 o+=1
#             if c==')':
#                 o-=1
#             if c=='*':
#                 st=True
#                 n+=1
#         print(o)
#         if o==0:
#             return True
#         if st and n>=abs(o):
#             return True
#         return False
class Solution(object):
    def checkValidString(self, s):
        low=0
        high=0
        for c in s:
            if c=='(':
                low+=1
                high+=1
            if c==')':
                low-=1
                high-=1
            if c=='*':
                low-=1
                high+=1
            low=max(0,low)
            if high<0:
                return False
        return low==0
test = Solution()
print(test.checkValidString("(((((*)))**"))