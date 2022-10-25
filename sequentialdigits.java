class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits="123456789";
        List<Integer> result=new ArrayList<>();
        for(int length=1;length<=9;length++){
            for(int j=0;j+length<=digits.length();j++){
                String subStr=digits.substring(j,j+length);
                int value=Integer.parseInt(subStr);
                if(value>=low&&value<=high){
                    result.add(value);
                }
            }
        }
        return result;
    }
}
