package entities;

public class ratings {
    int id_ratings;
    int id_registration;
    int rating;

    public ratings(){
    }

    public ratings (int id_ratings, int id_registration, int rating){
        this.id_ratings = id_ratings;
        this.id_registration = id_registration;
        this.rating = rating;
    }

    public int getId_ratings() {
        return id_ratings;
    }
    public void setId_ratings(int id_ratings) {
        this.id_ratings = id_ratings;
    }
    public int getId_registration() {
        return id_registration;
    }
    public void setId_registration(int id_registration) {
        this.id_registration = id_registration;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "ratings{" +
                "id_ratings=" + id_ratings +
                ", id_registration=" + id_registration +
                ", rating=" + rating +
                '}';
    }
}
