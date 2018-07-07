package com.jvms.i18neditor.editor.menu;

import javax.swing.JMenuItem;

import com.jvms.i18neditor.editor.Editor;
import com.jvms.i18neditor.util.MessageBundle;

/**
 * This class represents the Undo in Menu
 * 
 * @author Maximiliano Diaz
 */
public class UndoTranslationKeyMenuItem extends JMenuItem implements updateStatusInterface {
	private static final long serialVersionUID = 6032182493888769724L;

	public UndoTranslationKeyMenuItem(Editor editor, boolean enabled) {
		super(MessageBundle.get("menu.edit.undo.title"));
		addActionListener(e -> editor.UndoTranslationKey());
		setEnabled(enabled);
	}

	public void updateStatus(Editor editor) {
		setEnabled(editor.canUndoTranslation());
	}

}
