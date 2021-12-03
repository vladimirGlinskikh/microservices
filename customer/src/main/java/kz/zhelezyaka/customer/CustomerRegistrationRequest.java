package kz.zhelezyaka.customer;

public record CustomerRegistrationRequest(
        String firstname,
        String lastname,
        String email) {
}
