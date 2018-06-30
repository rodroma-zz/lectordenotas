package com.dds.lectordenotas.ui.windows;

import com.dds.lectordenotas.ui.vm.EstudianteViewModel;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.*;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

public class DatosEstudianteWindow extends Dialog<EstudianteViewModel> {

    public DatosEstudianteWindow(WindowOwner parent) {
        super(parent, new EstudianteViewModel());
    }

    @Override
    protected void createFormPanel(Panel mainPanel) {
        Panel form = new Panel(mainPanel);
        form.setLayout(new ColumnLayout(2));

        new Label(form).setText("Nombre:");
        new TextBox(form)
                .setWidth(100)
                .alignLeft()
                .bindValueToProperty("estudiante.nombre");

        new Label(form).setText("Apellido:");
        new TextBox(form)
                .setWidth(100)
                .alignLeft()
                .bindValueToProperty("estudiante.apellido");

        new Label(form).setText("Legajo:");
        new NumericField(form)
                .setWidth(100)
                .alignLeft()
                .bindValueToProperty("estudiante.legajo");

        new Label(form).setText("Github:");
        new TextBox(form)
                .setWidth(100)
                .alignLeft()
                .bindValueToProperty("estudiante.github");
    }

    @Override
    protected void addActions(Panel actions) {
        new Button(actions).setCaption("Guardar").onClick(this::accept);
        new Button(actions).setCaption("Cancelar").onClick(this::cancel).setAsDefault();
    }

}
