public class Book_User{
    public static void main(String[] args){
        Maths_Book mathsbook = new Maths_Book();
        mathsbook.subject();
        mathsbook.total_pages();
        mathsbook.published_by();
        mathsbook.price();

        English_Book englishbook = new English_Book();
        englishbook.subject();
        englishbook.total_pages();
        englishbook.published_by();
        englishbook.price();

        Science_Book sciencebook = new Science_Book();
        sciencebook.subject();
        sciencebook.total_pages();
        sciencebook.published_by();
        sciencebook.price();

    }
}