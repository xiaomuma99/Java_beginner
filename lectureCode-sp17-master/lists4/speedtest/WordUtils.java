public class WordUtils {

    public static String Findlongestlist(List61B<String> L){

        String result = L.getFirst();
        for(int i = 1; i < L.size(); i++){
            if(L.get(i).length() > result.length()){
                result = L.get(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List61B<String> L = new SLList<>();
        L.addLast("Apple");
        L.addLast("Pineapple");
        L.addFirst("Orange");
        L.addFirst("Banana");
//        String expect_result = "I like apple";
//        String result = Findlongestlist(L);
////        System.out.println(result);
//        org.junit.Assert.assertEquals(expect_result, result);
        L.print();
    }
}
