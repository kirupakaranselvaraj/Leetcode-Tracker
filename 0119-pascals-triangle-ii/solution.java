class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> r=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            r.add(1);
            for(int j=i-1;j>0;j--) r.set(j,r.get(j)+r.get(j-1));
        }
        return r;
    }
}
