public class SwapStringVariables {
    public static void main(String[] args) {
        String s1 = "tree";
        String s2 = "flower";

        // swap s1,s2 values without using 3rd (String) variable

        s1 = s1 + s2; // s1:treeflower s2:flower
        s2 = s1.substring(0, s1.length() - s2.length()); // s1:treeflower s2:tree
        s1 = s1.substring(s2.length()); // s1:flower s2:tree

        System.out.println("s1:" + s1 + " s2:" + s2);

        
        // (but inside of substring(), creates a 3rd variable "int subLen")

        // substring(int beginIndex, int endIndex)
        // Creates a new string from beginIndex to endIndex - 1

        // substring(int beginIndex)
        // Creates a new string starting from beginIndex to the end of the original
        // string.
    }
}
