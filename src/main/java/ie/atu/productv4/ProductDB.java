package ie.atu.productv4;

public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Book myBook = null;
        Software mySoftware = null;
        Product myProduct = null;
        Music myMusic = null;
        TV myTV = null;
        if (productCode.equalsIgnoreCase("java")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        }

        if (productCode.equalsIgnoreCase("studios")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }
        if (productCode.equalsIgnoreCase("Pink")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here by ");
            myMusic.setPrice(8);
            myMusic.setArtist("Pink Floyd");
            myMusic.setLabel("Part of the Columbia group");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("J456")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Poison");
            myMusic.setPrice(1);
            myMusic.setArtist("Jaydes");
            myMusic.setLabel("Galactic Songs");
            myProduct = myMusic;
        }else if (productCode.equalsIgnoreCase("DD5")) {
            myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Headlines");
            myMusic.setPrice(3);
            myMusic.setArtist("Drake");
            myMusic.setLabel("OVO");
            myProduct = myMusic;
        }
        if (productCode.equalsIgnoreCase("kdl43")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTV.setPrice(819);
            myTV.setManufacturer("Sony");
            myTV.setSize(55);
            myProduct = myTV;
        } else if (productCode.equalsIgnoreCase("AP4")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Flatscreen TV");
            myTV.setPrice(999.99);
            myTV.setManufacturer("Apple");
            myTV.setSize(30);
            myProduct = myTV;
        } else if (productCode.equalsIgnoreCase("MM5")) {
            myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("Microsoft TV");
            myTV.setPrice(852);
            myTV.setManufacturer("Microsoft");
            myTV.setSize(31);
            myProduct = myTV;
        }

        return myProduct;
    }
}

