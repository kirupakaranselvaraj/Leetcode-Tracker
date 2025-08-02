from collections import Counter

class Solution(object):
    def minCost(self, basket1, basket2):
        count1 = Counter(basket1)
        count2 = Counter(basket2)
        total = count1 + count2
        
        for fruit in total:
            if total[fruit] % 2 != 0:
                return -1

        extra1 = []
        extra2 = []
        for fruit in total:
            needed = total[fruit] // 2
            if count1[fruit] > needed:
                extra1.extend([fruit] * (count1[fruit] - needed))
            if count2[fruit] > needed:
                extra2.extend([fruit] * (count2[fruit] - needed))

        extra1.sort()
        extra2.sort(reverse=True)

        min_fruit = min(min(basket1), min(basket2))
        cost = 0
        for a, b in zip(extra1, extra2):
            cost += min(min(a, b), 2 * min_fruit)
        return cost

