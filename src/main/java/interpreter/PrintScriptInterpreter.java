package interpreter;

import java.io.File;

public interface PrintScriptInterpreter {
    /**
     * executes a PrintScript file handling its resulting messages and errors.
     * @param src Source file.
     * @param version PrintScript version, 1.0 and 1.1 must be supported.
     * @param emitter interface where print statements must be called.
     * @param handler interface where all syntax and semantic error will be reported.
     */
    void execute(File src, String version, PrintEmitter emitter, ErrorHandler handler);
}
