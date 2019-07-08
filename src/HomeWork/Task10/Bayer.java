package HomeWork.Task10;

import java.util.Random;

public class Bayer {

    private String sureName;
    private String name;
    private String patronymic;
    private long creditCard;
    private String bankAccount;

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * Генерирует 16 цифр карты
     */
    private void setRandomCardNumber() {
        String numbers = "0123456789";
        Random random = new Random();
        StringBuilder cardBuilder = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            char ch = numbers.charAt(random.nextInt(numbers.length()));
            cardBuilder.append(ch);
        }
        this.creditCard = Long.parseLong(cardBuilder.toString());
    }

    /**
     * Генерирует 20 цифр банковского счета
     */
    private void setRandomBankAccount() {
        String numbers = "0123456789";
        Random random = new Random();
        StringBuilder cardBuilder = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            char ch = numbers.charAt(random.nextInt(numbers.length()));
            cardBuilder.append(ch);
        }
        this.bankAccount = cardBuilder.toString();
    }

    public Bayer(String sureName, String name, String patronymic) {
        this.sureName = sureName;
        this.name = name;
        this.patronymic = patronymic;
        setRandomCardNumber();
        setRandomBankAccount();
    }

    @Override
    public String toString() {
        return "Покупатель: " + sureName + " " + name + " " + patronymic + "; номер карты: " + creditCard + "; номер счета: " + bankAccount;
    }
}
