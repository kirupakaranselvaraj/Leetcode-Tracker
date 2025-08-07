class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String a=x+"";
        ArrayList<Integer> res=new ArrayList<>();
        int i=0;
        for(String e:words){
            if(e.contains(a)){
                res.add(i);
            }
            i++;
        }
        return res;
    }
}
