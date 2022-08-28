public class Course {

    private String code;
    private String name;
    private int credits;

    public Course() {
        this.code = null;
        this.name = null;
        this.credits = 0;
    }

    public Course(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    public Course(Course course) {
        this.setCode(course.getCode());
        this.setName(course.getName());
        this.setCredits(course.getCredits());
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void print(){
        System.out.println(this);
    }

    public static void print(Course[] courses){
        for (int i = 0; i < courses.length; i++) {
            courses[i].print();
        }
    }

    boolean isEqual(Course course){
        return course.getCode().equals(this.getCode()) && course.getName().equals(this.getName()) && course.getCredits() == this.getCredits();
    }

    /**
     * selection sorting
     * @param courses
     */
    public static void sort(Course[] courses) {
        for (int i = 0; i < courses.length; i++) {
            for (int j = i + 1; j < courses.length; j++) {
                if(courses[j].getName().compareTo(courses[i].getName()) < 0){
                    Course course = courses[i];
                    courses[i] = courses[j];
                    courses[j] = course;
                }
            }
        }
    }

    /**
     * Case in-sensitive Linear Search
     * @param courses
     * @param term
     * @return index of array
     */
    public static int linearSearch(Course[] courses, String term) {
        for (int i = 0; i < courses.length; i++) {
            if(courses[i].getCode().toLowerCase().equals(term.toLowerCase()))
                return i;
        }
        return -1;
    }

    /**
     * Binary Search (But array must be sorted so it works well)
     * @param courses
     * @param term
     * @return key of array
     */
    public static int search(Course[] courses, String term) {
        
        int mid;
        int left = 0;
        int right = courses.length - 1;
        int search = -1;

        while(right <= courses.length){
            
            mid = ( ( right - left ) + left) / 2;
            
            if(courses[mid].getName().toLowerCase().equals(term.toLowerCase())){
                search = mid;
                break;
            }

            // take left part
            if(courses[mid].getName().toLowerCase().compareTo(term.toLowerCase()) > 0 ){
                right = mid - 1;
            }

            // take right part
            if(courses[mid].getName().toLowerCase().compareTo(term.toLowerCase()) < 0 ){
                left = mid + 1;
            }

        }

        return search;
    }

    @Override
    public String toString() {
        return "Course [code=" + code + ", credits=" + credits + ", name=" + name + "]";
    }

}
