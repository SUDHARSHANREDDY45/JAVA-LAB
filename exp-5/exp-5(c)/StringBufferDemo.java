class StringBufferDemo
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Java Programming");

        System.out.println(sb);

        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);
    }
}
