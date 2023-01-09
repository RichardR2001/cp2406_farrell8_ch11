public class UseBook
{
    public static void main(String[] args)
    {
        Fiction aNovel = new Fiction("Twilight");
        NonFiction aManual = new NonFiction("The Confidence Game");
        System.out.println("Fiction " + aNovel.getTitle() + " costs $" + aNovel.getPrice());
        System.out.println("Non-Fiction " + aManual.getTitle() + " costs $" + aManual.getPrice());
    }
}
