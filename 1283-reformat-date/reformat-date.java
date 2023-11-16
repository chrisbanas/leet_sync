class Solution {
    public String reformatDate(String date) {
        Map<String, String> months = new HashMap<>(Map.of("Jan", "01", "Feb", "02", "Mar", "03", "Apr", "04", "May", "05", "Jun", "06", "Jul", "07", "Aug", "08", "Sep", "09", "Oct", "10"));

        months.put("Nov", "11");
        months.put("Dec", "12");

        String[] info = date.split(" ");

        StringBuilder day = new StringBuilder();
        day.append('0');

        for (char c : info[0].toCharArray()) {
            if (Character.isDigit(c)) {
                day.append(c);
            } else {
                break;
            }
        }

        if (day.length() > 2) {
            day.deleteCharAt(0);
        }

        return info[2] + "-" + months.get(info[1]) + "-" + day;
    }
}

// This solutions time and space is constant as the input data will never change in size.