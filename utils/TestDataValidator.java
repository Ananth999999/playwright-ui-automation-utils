import java.util.HashMap;
import java.util.Map;

public class TestDataValidator {

    public static void main(String[] args) {
        Map<String, String> record = new HashMap<>();
        record.put("username", "standard_user");
        record.put("password", "secret_sauce");
        record.put("email", "");

        validateRequired(record, "username");
        validateRequired(record, "password");
        validateRequired(record, "email");
    }

    private static void validateRequired(Map<String, String> record, String field) {
        String value = record.get(field);

        if (value == null || value.trim().isEmpty()) {
            System.out.println("[FAIL] Missing/empty field: " + field);
        } else {
            System.out.println("[PASS] " + field + " = " + value);
        }
    }
}
