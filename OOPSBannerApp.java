public class OOPSBannerApp {

    public static void main(String[] args) {
        
        // Define the gap between letters
        String gap = "     "; 

        // UC4: Store all banner lines in a String array
        // This separates the DATA (the strings) from the LOGIC (the printing)
        String[] bannerLines = {
            String.join("", "*****", gap, "*****", gap, "********", gap, " ********"),
            String.join("", "** **", gap, "** **", gap, "**    **", gap, " **"),
            String.join("", "** **", gap, "** **", gap, "********", gap, " ********"),
            String.join("", "** **", gap, "** **", gap, "** ", gap, "            **"),
            String.join("", "*****", gap, "*****", gap, "** ", gap, "      ********")
        };

        // UC4: Use a loop to iterate through the array and print each line
        // This replaces the 5 separate print statements from UC3
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}