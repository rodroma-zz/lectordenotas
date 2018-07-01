package com.dds.lectordenotas.ui.windows;

import com.dds.lectordenotas.model.Asignacion;
import com.dds.lectordenotas.model.Calificacion;
import com.dds.lectordenotas.model.Tarea;
import com.dds.lectordenotas.ui.vm.TareasViewModel;
import javafx.scene.layout.Pane;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;

public class TareasWindow extends Dialog<TareasViewModel> {

    public TareasWindow(WindowOwner parent) {
        super(parent, new TareasViewModel());
    }

    @Override
    protected void createFormPanel(Panel mainPanel) {
        Panel panel = new Panel(mainPanel);
        panel.setLayout(new ColumnLayout(2));

        // TODO: Aprender a usar el transformer
        new Label(panel).bindValueToProperty("estudianteLogueado.nombre");
        // TODO: Como dejo el layout mas lindo
        new Label(panel);

        new Label(panel).setText("Tarea:");
        Selector<Tarea> tareaSelector = new Selector<Tarea>(panel).allowNull(true);
        tareaSelector.bindItemsToProperty("tareas");
        tareaSelector.bindValueToProperty("tareaSeleccionada");

        tareaSelector.onSelection(() -> {
            // El onSelection se ejecuta ANTES de que cambien las calificaciones. LUL
            this.getModelObject().refreshCalificaciones();
        });

        Panel dondeEstaLaTabla = new Panel(panel);


        Table<Calificacion> calificaciones = new Table<>(dondeEstaLaTabla, Calificacion.class);
        calificaciones.bindItemsToProperty("asignacion.calificaciones");
        calificaciones.bindValueToProperty("calificacionSeleccionada");
        calificaciones.setWidth(300);
        calificaciones.setHeight(300);
        calificaciones.setNumberVisibleRows(2);

        new Column<>(calificaciones)
                .setTitle("Nota")
                .setFixedSize(150)
                .bindContentsToProperty("nota");

        new Column<>(calificaciones)
                .setTitle("Aprobo")
                .setFixedSize(150)
                .bindContentsToProperty("aprobado");

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
