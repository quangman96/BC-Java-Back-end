package service;

import model.ExportOrder;

import java.sql.SQLException;
import java.util.List;

public interface ExportService{
    List<ExportOrder> findAll() ;

    void save (ExportOrder exportOrder);

    ExportOrder findById(int id);
//    List<ExportOrder> findById(int id);

    void update (int idExportOrder, ExportOrder exportOrder);

    void remove (int idExport, ExportOrder exportOrder);
}