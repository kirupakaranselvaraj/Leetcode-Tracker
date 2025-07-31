class Solution:
    def subarrayBitwiseORs(self, arr):
        result = set()
        current = set()
        
        for num in arr:
            new_current = {num | x for x in current} | {num}
            current = new_current
            result |= current
        
        return len(result)

