package anasproject.hospitaldatabase;


import anasproject.hospitaldatabase.extraThings.FullName;

public class Pacient {
        private String id;
        private FullName fullName;
        private String adress;
        private int phone;
        private String email;

        public Pacient(String id, FullName fullName, String adress, int phone, String email) {
            this.id = id;
            this.fullName = fullName;
            this.adress = adress;
            this.phone = phone;
            this.email = email;
        }


        public boolean verifyEmail()
        {
            if(email.contains("@"))
                return true;
            else
                return false;
        }
    }

