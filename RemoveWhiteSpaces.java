class RemoveWhiteSpaces
{
    public static void main(String[] args)
    {
        String str1 = "Rohirat        won the    worldcup";
        String str2 = str1.replaceAll("\\s", "");
        System.out.println(str2);
    }
}
