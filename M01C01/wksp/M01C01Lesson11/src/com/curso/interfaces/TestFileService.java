package com.curso.interfaces;

/**
 * @author JLIL
 */
public class TestFileService {
    public static void main(String[] args) {
        IService service = new FileService();
        service.init("File");
        service.info();
        //IService.info();
        //FileService.info();
    }
}
