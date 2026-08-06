package com.example.mangogardenestate.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/** Temporary in-memory storage for Security Guard and Packaging Officer forms. */
public final class TemporaryRecordStore {
    private static final ArrayList<StoredRecord> records = new ArrayList<>();

    private TemporaryRecordStore() {
    }

    public static Optional<StoredRecord> find(String formName, String reference) {
        return records.stream()
                .filter(record -> record.formName().equals(formName)
                        && record.reference().equalsIgnoreCase(reference.trim()))
                .findFirst();
    }

    public static void save(String formName, String reference, String details, String status) {
        find(formName, reference).ifPresent(records::remove);
        records.add(new StoredRecord(formName, reference.trim(), details.trim(), status));
    }

    public static List<StoredRecord> findAll(String formName) {
        return records.stream()
                .filter(record -> record.formName().equals(formName))
                .toList();
    }

    public record StoredRecord(String formName, String reference, String details, String status) {
    }
}
