package classfile;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import classfile.constant.FieldRefConstant;

public class Field {
	private FieldRefConstant fieldRef;

	public Field(FieldRefConstant f) {
		this.fieldRef = f;
	}

	public Element writeXml(Document doc) {
		Element element = doc.createElement("field");
		element.appendChild(doc.createComment(this.fieldRef.getNameAndType()
				.getNameIndex().getBytes()
				+ ": "
				+ this.fieldRef.getNameAndType().getDescriptorIndex()
						.getBytes()));

		Element name = doc.createElement("name_index");
		name.appendChild(doc.createTextNode("" + this.fieldRef.getNameAndType().getNameIndex().getIndex()));
		Element desc = doc.createElement("descriptor_index");
		desc.appendChild(doc.createTextNode(""
				+ this.fieldRef.getNameAndType().getDescriptorIndex().getIndex()));

		element.appendChild(name);
		element.appendChild(desc);
		
		return element;
	}
}
