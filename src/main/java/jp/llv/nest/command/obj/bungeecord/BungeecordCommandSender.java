/*
 * The MIT License
 *
 * Copyright 2016 toyblocks.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package jp.llv.nest.command.obj.bungeecord;

import java.util.Collection;
import jp.llv.nest.command.Type;
import jp.llv.nest.command.obj.NestCommandSender;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.BaseComponent;

/**
 *
 * @author toyblocks
 */
@Type("BungeecordUser")
public abstract class BungeecordCommandSender<S extends CommandSender> extends NestCommandSender<S> {
    
    public BungeecordCommandSender(S value) {
        super(value);
    }

    public String getName() {
        return super.value.getName();
    }

    @Override
    @Deprecated
    public void sendMessage(String message) {
        super.value.sendMessage(message);
    }

    @Deprecated
    public void sendMessages(String... messages) {
        super.value.sendMessages(messages);
    }

    public void sendMessage(BaseComponent... message) {
        super.value.sendMessage(message);
    }

    public void sendMessage(BaseComponent message) {
        super.value.sendMessage(message);
    }

    public Collection<String> getGroups() {
        return super.value.getGroups();
    }

    @Override
    public boolean hasPermission(String permission) {
        return super.value.hasPermission(permission);
    }
    
}
