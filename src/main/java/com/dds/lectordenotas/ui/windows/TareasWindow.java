package com.dds.lectordenotas.ui.windows;

import com.dds.lectordenotas.model.Tarea;
import com.dds.lectordenotas.ui.vm.TareasViewModel;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import java.awt.*;

public class TareasWindow extends Dialog<TareasViewModel> {

    public TareasWindow(WindowOwner parent) {
        super(parent, new TareasViewModel());
    }

    @Override
    protected void createFormPanel(Panel mainPanel) {
        Panel panel = new Panel(mainPanel);

        Table<Tarea> tareas = new Table<>(panel, Tarea.class);
        tareas.bindItemsToProperty("tareasDelEstudiante");

        new Column<>(tareas)
                .alignCenter()
                .setTitle("Nota")
                .setFixedSize(150)
                .bindContentsToProperty("nota");

        new Column<>(tareas)
                .alignCenter()
                .setTitle("Estudiante")
                .setFixedSize(150)
                .bindContentsToProperty("estudiante.nombre");

        tareas.setHeight(300);
        tareas.setWidth(300);
    }

    public void editarDatos() {
        Dialog<?> datosEstudianteWindow = new DatosEstudianteWindow(this);

        datosEstudianteWindow.open();
        datosEstudianteWindow.onAccept(() -> {});
    }

    @Override
    protected void addActions(Panel actionsPanel) {
        new Button(actionsPanel)
                .setCaption("Editar datos")
                .onClick(this::editarDatos);

        new Button(actionsPanel)
                .setCaption("Salir")
                .onClick(this::cancel)
                .setAsDefault();
    }
}
