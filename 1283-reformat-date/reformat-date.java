// OPTOMIZED CODE

class Solution {
    public String reformatDate(String date) {
        Map<String, String> days = new HashMap<>(Map.of("1st", "01", "2nd", "02", "3rd", "03", "4th", "04", "5th", "05", "6th", "06", "7th", "07", "8th", "08", "9th", "09", "10th", "10"));
        days.put("11th", "11");
        days.put("12th", "12");
        days.put("13th", "13");
        days.put("14th", "14");
        days.put("15th", "15");
        days.put("16th", "16");
        days.put("17th", "17");
        days.put("18th", "18");
        days.put("19th", "19");
        days.put("20th", "20");
        days.put("21st", "21");
        days.put("22nd", "22");
        days.put("23rd", "23");
        days.put("24th", "24");
        days.put("25th", "25");
        days.put("26th", "26");
        days.put("27th", "27");
        days.put("28th", "28");
        days.put("29th", "29");
        days.put("30th", "30");
        days.put("31st", "31");

        Map<String, String> months = new HashMap<>(Map.of("Jan", "01", "Feb", "02", "Mar", "03", "Apr", "04", "May", "05", "Jun", "06", "Jul", "07", "Aug", "08", "Sep", "09", "Oct", "10"));
        months.put("Nov", "11");
        months.put("Dec", "12");

        StringBuilder output = new StringBuilder();
        String[] info = date.split(" ");

        output.append(info[2]);
        output.append('-');
        output.append(months.get(info[1]));
        output.append('-');
        output.append(days.get(info[0]));

        return output.toString();
    }
}