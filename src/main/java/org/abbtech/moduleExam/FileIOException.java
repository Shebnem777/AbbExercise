package org.abbtech.moduleExam;

    //Etibarsız inventar elementi məlumatları üçün InvalidDataException, inventarda element tapılmadıqda ItemNotFoundException
    // və fayl giriş/çıxış xətaları üçün FileIOException kimi fərdi istisna sinifləri yaradın.
    // Müvafiq şərtlərlə qarşılaşdıqda bu xüsusi istisnaları atın.
    import java.io.IOException;
// Fayl giriş/çıxış xətaları üçün
    class FileIOException extends IOException {
        public FileIOException(String message) {
            super(message);
        }
    }

