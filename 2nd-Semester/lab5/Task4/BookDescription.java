    public class BookDescription {
        private String title;
        private String author;
        private String publisher;
        private int soldCopies;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public void setSoldCopies(int copies) {
            this.soldCopies = copies;
        }

        public String getTitle() {
            return this.title;
        }

        public String getAuthor() {
            return this.author;
        }

        public String getPublisher() {
            return this.publisher;
        }

        public int getSoldCopies() {
            return this.soldCopies;
        }
    }
    