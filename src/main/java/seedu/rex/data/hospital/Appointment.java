package seedu.rex.data.hospital;

import java.time.LocalDate;

/**
 * Appointment class.
 */
public class Appointment {

    private LocalDate date;
    private String time;
    private Patient patient;
    private Doctor doctor;
    private String notes;
    private Prescription prescription;
    private Boolean isBooked;

    public Appointment(LocalDate date) {
        this.date = date;
        isBooked = false;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    /**
     * Checks if appointment is booked.
     *
     * @return If appointment is booked.
     */
    public Boolean isBooked() {
        return isBooked;
    }

    /**
     * Books an appointment for the patient.
     *
     * @param patient Patient to schedule appointment with.
     */
    public void book(Patient patient) {
        this.patient = patient;
        isBooked = true;
    }

    public void removeBooking() {
        this.patient = null;
        isBooked = false;
    }

    /**
     * Formats appointment to a string.
     *
     * @return String formatted.
     */
    @Override
    public String toString() {
        String date = this.date.toString();
        String bookedStatus;
        String patientNric;
        if (isBooked) {
            bookedStatus = "booked";
        } else {
            bookedStatus = "available";
        }
        if (patient != null) {
            patientNric = patient.getNric();
        } else {
            patientNric = null;
        }
        return date + ", " + bookedStatus + ", " + patientNric;
    }
}
