<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<classfile>
    <magic>classfile</magic>
    <minor_version>0</minor_version>
    <major_version>1</major_version>
    <constant_pool>
        <constant_utf8 id="1">
            <bytes>Code</bytes>
        </constant_utf8>
        <constant_utf8 id="2">
            <bytes>ATest</bytes>
        </constant_utf8>
        <constant_class id="3">
            <name_index>2</name_index>
        </constant_class>
        <constant_utf8 id="4">
            <bytes>global</bytes>
        </constant_utf8>
        <constant_utf8 id="5">
            <bytes>I</bytes>
        </constant_utf8>
        <constant_name_and_type id="6">
            <!--global: I-->
            <name_index>4</name_index>
            <descriptor_index>5</descriptor_index>
        </constant_name_and_type>
        <constant_fieldref id="7">
            <!--global: I-->
            <class_index>3</class_index>
            <name_and_type_index>6</name_and_type_index>
        </constant_fieldref>
        <constant_utf8 id="8">
            <bytes>doIt</bytes>
        </constant_utf8>
        <constant_utf8 id="9">
            <bytes>(I)I</bytes>
        </constant_utf8>
        <constant_name_and_type id="10">
            <!--doIt: (I)I-->
            <name_index>8</name_index>
            <descriptor_index>9</descriptor_index>
        </constant_name_and_type>
        <constant_methodref id="11">
            <!--doIt: (I)I-->
            <class_index>3</class_index>
            <name_and_type_index>10</name_and_type_index>
        </constant_methodref>
        <constant_utf8 id="12">
            <bytes>main</bytes>
        </constant_utf8>
        <constant_utf8 id="13">
            <bytes>()V</bytes>
        </constant_utf8>
        <constant_name_and_type id="14">
            <!--main: ()V-->
            <name_index>12</name_index>
            <descriptor_index>13</descriptor_index>
        </constant_name_and_type>
        <constant_methodref id="15">
            <!--main: ()V-->
            <class_index>3</class_index>
            <name_and_type_index>14</name_and_type_index>
        </constant_methodref>
        <constant_integer id="16">
            <bytes>10</bytes>
        </constant_integer>
    </constant_pool>
    <this_class>3</this_class>
    <field_info>
        <field>
            <!--global: I-->
            <name_index>4</name_index>
            <descriptor_index>5</descriptor_index>
        </field>
    </field_info>
    <method_info>
        <method>
            <!--doIt: (I)I-->
            <name_index>8</name_index>
            <descriptor_index>9</descriptor_index>
            <attribute_info>
                <attribute>
                    <attribute_name_index>1</attribute_name_index>
                    <info>
                        <max_stack>10</max_stack>
                        <max_locals>1</max_locals>
                        <code>
ILOAD 0
IRETURN
</code>
                    </info>
                </attribute>
            </attribute_info>
        </method>
        <method>
            <!--main: ()V-->
            <name_index>12</name_index>
            <descriptor_index>13</descriptor_index>
            <attribute_info>
                <attribute>
                    <attribute_name_index>1</attribute_name_index>
                    <info>
                        <max_stack>10</max_stack>
                        <max_locals>1</max_locals>
                        <code>
LDC_W 16
INVOKESTATIC 11
ISTORE 0
ILOAD 0
PUTSTATIC 7
RETURN
</code>
                    </info>
                </attribute>
            </attribute_info>
        </method>
    </method_info>
</classfile>

