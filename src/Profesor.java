public class Profesor {
    private String nume, prenume, email;
    private GradDidactic grad;

    public Profesor(String nume, String prenume, String email, GradDidactic grad) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.grad = grad;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GradDidactic getGrad() {
        return grad;
    }

    public void setGrad(GradDidactic grad) {
        this.grad = grad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", email='" + email + '\'' +
                ", grad=" + grad +
                '}';
    }
}
