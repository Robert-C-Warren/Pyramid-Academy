package boardingpass.boardingpassfx;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class BoardingPass {
    private BufferedImage boardingPass = new BufferedImage(708, 312, BufferedImage.TYPE_INT_ARGB);
    private final File generatedFiles = new File("C:\\Pyramid-Academy\\BoardingPassFX\\src\\main\\java\\BoardingPassOutput");
    private String name;
    private String email;
    private String phoneNumber;
    private String gender;
    private String age;
    private String date;
    private String origin;
    private String destination;
    private String flightClass;
    private final Random ran = new Random();
    private String flightNumber;
    private String gate;
    private String flightTime;
    private String seat;

    public BoardingPass(String name, String email, String phoneNumber, String gender, String age,
                        String date, String origin, String destination, String flightClass, String seat) {
        this.name = String.valueOf(name);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
        this.date = date;
        this.origin = origin;
        this.destination = destination;
        this.flightClass = flightClass;
        this.seat = seat;
    }

    public void generatePass() throws IOException {
        boardingPass = passType();
        flightNumber = generateFlightNumber();
        gate = generateGate();
        flightTime = calculateTime();
        Graphics2D g2d = boardingPass.createGraphics();

        g2d.setFont(new Font("san", Font.BOLD, 12));
        g2d.setPaint(Color.WHITE);

        //Email
        g2d.drawString(email.toUpperCase(Locale.ROOT), 152, 362);

        //Phone Number
        g2d.drawString(phoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"), 382, 362);

        g2d.setFont(new Font("san", Font.BOLD, 12));
        g2d.setPaint(Color.BLACK);

        //Name
        g2d.drawString(name.toUpperCase(Locale.ROOT), 152, 145);

        //Gender
        g2d.drawString(gender.toUpperCase(Locale.ROOT), 300, 145);

        //Age
        g2d.drawString(age.toUpperCase(Locale.ROOT), 355, 145);

        //Origin
        g2d.drawString(origin.toUpperCase(Locale.ROOT), 152, 205);

        //Destination
        g2d.drawString(destination.toUpperCase(Locale.ROOT), 152, 260);

        //Date
        g2d.drawString(date.toUpperCase(Locale.ROOT), 382, 145);

        //Time
        g2d.drawString(flightTime.toUpperCase(Locale.ROOT), 542, 145);

        //Flight Number
        g2d.drawString(flightNumber.toUpperCase(Locale.ROOT), 382, 260);

        //Seat
        g2d.drawString(seat.toUpperCase(Locale.ROOT), 542, 205);

        //Gate
        g2d.drawString(gate.toUpperCase(Locale.ROOT), 382, 205);

        //SmallPrint
        g2d.setPaint(Color.DARK_GRAY);
        g2d.setFont(new Font("san", Font.BOLD, 10));

        //Name
        g2d.drawString(name.toUpperCase(Locale.ROOT), 730, 115);

        //From
        g2d.drawString(origin.toUpperCase(Locale.ROOT), 730, 152);

        //Destination
        g2d.drawString(destination.toUpperCase(Locale.ROOT), 730, 190);

        //Date
        g2d.drawString(date.toUpperCase(Locale.ROOT), 730, 230);

        //Time
        g2d.drawString(flightTime.toUpperCase(Locale.ROOT), 837, 190);

        //Flight Number
        g2d.drawString(flightNumber.toUpperCase(Locale.ROOT), 730, 304);

        //Seat
        g2d.drawString(seat.toUpperCase(Locale.ROOT), 837, 230);

        //Gate
        g2d.drawString(gate.toUpperCase(Locale.ROOT), 730, 268);

        g2d.dispose();
    }

    public void writeImage() throws IOException {
        File file = new File("C:\\Pyramid-Academy\\BoardingPassFX\\src\\main\\java\\BoardingPassOutput\\BoardingPass" + flightNumber + "-" + ".png");
        ImageIO.write(boardingPass, "png", file);
    }

    private BufferedImage passType() throws IOException {
        if(flightClass.equals("Business")) {
            boardingPass = ImageIO.read(new File("C:\\Pyramid-Academy\\BoardingPassFX\\src\\main\\java\\Assets\\BuisnessClass.jpg"));
        } else {
            boardingPass = ImageIO.read(new File("C:\\Pyramid-Academy\\BoardingPassFX\\src\\main\\java\\Assets\\EconomyClass.jpg"));
        }
        return boardingPass;
    }

    private String generateFlightNumber() {
        String aToZ = "abcdefghijklmnopqrstuvwxyz";
        int ranS = ran.nextInt(aToZ.length());
        int ranS2 = ran.nextInt(aToZ.length());

        flightNumber = (ran.nextInt(0, 9)) + aToZ.substring(ranS, ranS + 1)
                + (ran.nextInt(0, 9)) + aToZ.substring(ranS2, ranS2 + 1);
        return flightNumber;
    }

    private String generateGate() {
        ArrayList<String> availableGates = new ArrayList<>();
        for (Gates s: Gates.values()) {
            availableGates.add(String.valueOf(s));
        }

        gate = availableGates.get(ran.nextInt(availableGates.size()));

        return gate;
    }

    private String calculateTime() {
        int hours = ran.nextInt(1, 6);
        int minutes = ran.nextInt(1, 60);
        flightTime = hours + ":" + minutes;
        return flightTime;
    }

//    private String generateSeat() {
//        ArrayList<String> availableSeat = new ArrayList<>();
//
//        for (Seat s: Seat.values() ){
//            boolean b = (s.toString().endsWith(Integer.toString(1)) && s.toString().length() == 2) ||
//                    (s.toString().endsWith(Integer.toString(2)) && s.toString().length() == 2) ||
//                    (s.toString().endsWith(Integer.toString(3)) && s.toString().length() == 2) ||
//                    (s.toString().endsWith(Integer.toString(4)) && s.toString().length() == 2);
//
//            if(flightClass.equals("Business")){
//                if(b) {
//                    availableSeat.add(String.valueOf(s));
//                }
//            }
//            else{
//                if(b) {
//                    continue;
//                }
//                else
//                    availableSeat.add(String.valueOf(s));
//            }
//        }
//
//        for(String fileName: generatedFiles.list()){
//            String substring = fileName.substring(fileName.lastIndexOf("-") + 1, fileName.lastIndexOf("."));
//            if(availableSeat.contains(substring)){
//                availableSeat.remove(substring);
//            }
//        }
//
//        while (seat == null) {
//            //System.out.println("Please choose an Available Seats or Enter 0 for random seat");
//            System.out.println(availableSeat);
//            String inputSeat = userInput.nextLine();
//            if (availableSeat.contains(inputSeat.toUpperCase())) {
//                seat = inputSeat;
//            } else if (inputSeat.equals("0")) {
//                seat = availableSeat.get(ran.nextInt(availableSeat.size()));
//            } else
//            //  System.out.println("Seat is unavailable Please choose another");
//        }
//
//        return seat;
//    }
}
