Ext.define("app.view.MainMenu", {
    extend: 'Ext.Component',
	 layout: 'vbox',
	alias:'widget.mainmenu',

    initComponent: function() {
        Ext.apply(this, {
            width: 475,
            items: [{
                xtype: 'checkbox',
                boxLabel: 'disabled',
                margin: '0 0 0 10',
                listeners: {
                    change: this.toggleDisabled,
                    scope: this
                }
            }, {
                xtype: 'container',
                layout: {
                    type: 'table',
                    columns: 4,
                    tdAttrs: { style: 'padding: 5px 10px;' }
                },
                defaults: {
                    href: 'http://www.sencha.com/'
                },
               
                items: [{
                    xtype: 'component',
                    html: 'Text Only'
                }, {
                    xtype: 'button',
                    text: 'Small'
                }, {
                    xtype: 'button',
                    text: 'Medium',
                    scale: 'medium'
                }, {
                    xtype: 'button',
                    text: 'Large',
                    scale: 'large'
                }, {
                    xtype: 'component',
                    html: 'Icon Only'
                }, {
                    glyph: 72,
                    xtype: 'button'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    scale: 'medium'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    scale: 'large'
                }, {
                    xtype: 'component',
                    html: 'Icon and Text (left)'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    text: 'Small'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    text: 'Medium',
                    scale: 'medium'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    text: 'Large',
                    scale: 'large'
                }, {
                    xtype: 'component',
                    html: 'Icon and Text (top)'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    text: 'Small',
                    iconAlign: 'top'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    text: 'Medium',
                    scale: 'medium',
                    iconAlign: 'top'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    text: 'Large',
                    scale: 'large',
                    iconAlign: 'top'
                }, {
                    xtype: 'component',
                    html: 'Icon and Text (right)'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    text: 'Small',
                    iconAlign: 'right'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    text: 'Medium',
                    scale: 'medium',
                    iconAlign: 'right'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    text: 'Large',
                    scale: 'large',
                    iconAlign: 'right'
                }, {
                    xtype: 'component',
                    html: 'Icon and Text (bottom)'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    text: 'Small',
                    iconAlign: 'bottom'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    text: 'Medium',
                    scale: 'medium',
                    iconAlign: 'bottom'
                }, {
                    xtype: 'button',
                    glyph: 72,
                    text: 'Large',
                    scale: 'large',
                    iconAlign: 'bottom'
                }]
            }]
        });
        this.callParent();
    }
});