package com.louisamoros.cdb.model;

import java.time.LocalDate;

/**
 * Computer model class.
 */
public final class Computer {

    private long computerId;
    private Company company;
    private String computerName;
    private LocalDate introduced;
    private LocalDate discontinued;

    /**
     * Computer class use builder pattern.
     *
     * @param builder the builder
     */
    private Computer(final Builder builder) {
        this.computerId = builder.computerId;
        this.computerName = builder.computerName;
        this.company = builder.company;
        this.discontinued = builder.discontinued;
        this.introduced = builder.introduced;
    }

    public long getComputerId() {
        return computerId;
    }

    public Company getCompany() {
        return company;
    }

    public String getComputerName() {
        return computerName;
    }

    public LocalDate getIntroduced() {
        return introduced;
    }

    public LocalDate getDiscontinued() {
        return discontinued;
    }

    @Override
    public String toString() {
        return "Computer [computerId=" + computerId + ", company=" + company + ", computerName="
                + computerName + ", introduced=" + introduced + ", discontinued=" + discontinued
                + "]";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Computer computer = (Computer) o;

        if (computerId != computer.computerId) {
            return false;
        }
        if (company != null ? !company.equals(computer.company) : computer.company != null) {
            return false;
        }
        if (!computerName.equals(computer.computerName)) {
            return false;
        }
        if (introduced != null ? !introduced.equals(computer.introduced) : computer.introduced != null) {
            return false;
        }
        return discontinued != null ? discontinued.equals(computer.discontinued) : computer.discontinued == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (computerId ^ (computerId >>> 32));
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + computerName.hashCode();
        result = 31 * result + (introduced != null ? introduced.hashCode() : 0);
        result = 31 * result + (discontinued != null ? discontinued.hashCode() : 0);
        return result;
    }

    /**
     * The builder class for computer model.
     */
    public static class Builder {

        // require
        private String computerName;

        // optional
        private long computerId;
        private Company company;
        private LocalDate introduced;
        private LocalDate discontinued;

        /**
         * Building the name in the constructor as it is required parameter.
         *
         * @param name the name
         */
        public Builder(final String name) {
            this.computerName = name;
        }

        /**
         * Building the id.
         *
         * @param computerId the computer id
         * @return builder
         */
        public final Builder id(final long computerId) {
            this.computerId = computerId;
            return this;
        }

        /**
         * Building the company.
         *
         * @param company the company
         * @return builder
         */
        public final Builder company(final Company company) {
            this.company = company;
            return this;
        }

        /**
         * Building the introduced date.
         *
         * @param introduced the introduced date
         * @return builder
         */
        public final Builder introduced(final LocalDate introduced) {
            this.introduced = introduced;
            return this;
        }

        /**
         * Building the discontinued date.
         *
         * @param discontinued the discontinued date
         * @return builder
         */
        public final Builder discontinued(final LocalDate discontinued) {
            this.discontinued = discontinued;
            return this;
        }

        /**
         * Building the computer object.
         *
         * @return computer
         */
        public final Computer build() {
            return new Computer(this);
        }

    }

}
